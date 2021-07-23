 $(function(){
                $("#main_aside li:nth-child(1)").click(
                    function(){
                        //alert("test");
                        $("section").load("hangboard.html");
                    }
                );
                $("#main_aside li:nth-child(2)").click(
                    function(){
                        //alert("test");
                        $("section").load("kilterboard.html");
                    }
                );
                $("#main_aside li:nth-child(3)").click(
                    function(){
                        //alert("test");
                        $("aside > h1").text($("#main_aside li:nth-child(3)").text())
                        $("section").load("moonboard.html");
                    }
                );
                $("#main_aside li:nth-child(4)").click(
                    function(){
                        //alert("test");
                        $("aside > h1").text($("#main_aside li:nth-child(4)").text())
                        $("section").load("climbinghold.html");
                    }
                );
            })