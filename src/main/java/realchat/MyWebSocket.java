package realchat;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/wsocket")
public class MyWebSocket{
	private static final Set<Session> sessions
	=Collections.synchronizedSet
	(new HashSet<Session>());
	static int i=0;
	@OnOpen
	public void handleOpen(Session session) {
		System.out.println("클라이언트가 접속되었습니다.");
		i++;
		System.out.println("접속자수:"+i);
		//접속되는 세션을 저장소에 저장하는 작업
		sessions.add(session);
		
	}
	
	@OnClose
	public void handleClose() {
		System.out.println("클라이언트 접속이 해제되었습니다.");
		i--;
	}
	
	@OnError
	public void handleError(Throwable error) {
		error.printStackTrace();
	}
	
	@OnMessage
	public void handleMessage(String message) {
		System.out.println("수신된메시지:"+message);
		try {
			for(Session s:sessions) {	
			s.getBasicRemote().sendText(message);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		//return "수신완료";
	}
	
}
