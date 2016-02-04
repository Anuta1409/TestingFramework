<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style type="text/css">
            
            body{
                margin: 0;
                padding: 0;
                background-image: url(http://static.hdw.eweb4.com/media/wallpapers_dl/1/107/1063726-background-design.jpg);
            }
            
            #login_block{
                width: 500px;
                height: 400px;
                position: absolute;
                top: 0;
                right: 0;
                bottom: 0;
                left: 0;
                margin: auto;
                background:#470074;
/*                border-top: 30px solid #C84AFF;*/
                box-shadow:0pt 2px 20px #080407;
                border-radius: 20px;
              
            }
            #login_block{
                z-index: 22;
            }
            h1{
                text-align:center;
                font-family: 'Times New Roman', Times, serif; /* Шрифт с засечками */
                font-style: italic; /* Курсивное начертание */
                color: white; 
                font-size: 40px;
            }
            
            input {
            margin: 10px 90px;
            padding: 0px 15px;
            height:40px;
            width:300px;
            background: #ffffff;
            border: none;
            border-radius: 20px; 
            color: black;
            font-size: 20px;
            }
            input::-webkit-input-placeholder {
                color: #5C5C5C;
                font-style: italic;
                font-size: 15px;
            }
            
            .button{
                margin: 15px 106px;
                background: -webkit-gradient(linear, 0 0, 0 100%, from(#602E6F), to(#D0AFDA));
                filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#602E6F', endColorstr='#D0AFDA');
                font-style: italic;
                font-weight: bold;
                font-size: 23px;
                
            }
            
            .button:hover{
                background: #D0AFDA;
                box-shadow:0pt 2px 20px #B34EE9;
            }
            
            
            
            
        </style>
    </head>
    <body>
        <div id="login_block">
            <h1 >Log in</h1>
            <form method ="post" action="login">
                <div>
                    <input type="text" name="login" required="required" placeholder="User Name or mymail@mail.com"/>
                </div>
                <div>
                    <input type="password" name="password" required="required"  placeholder="Password" />  
                </div>
                <div>
                <input class="button" type="submit" value="Submit"/>    
                </div>
            </form>
        </div>
    </body>
</html>
