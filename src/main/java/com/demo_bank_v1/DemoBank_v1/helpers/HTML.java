package com.demo_bank_v1.DemoBank_v1.helpers;

public class HTML {
    public static String htmlEmailTemplate(String token, String code) {
        //Verify Account URL:
        String url = "http://127.0.0.1:8080/verify?token" + token + "&code=" + code;
        String emailTemplate = "<!DOCTYPE html>\\n\" +\n" +
                "        \"<html lang='en'>\\n\" +\n" +
                "        \"<head>\\n\" +\n" +
                "        \"    <meta charset='UTF-8'>\\n\" +\n" +
                "        \"    <meta http-equiv='X-UA-Compatible' content='IE=edge'>\\n\" +\n" +
                "        \"    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\\n\" +\n" +
                "        \"    <!-- <link rel='stylesheet' href='css/email.css'> -->\\n\" +\n" +
                "        \"    <title>Document</title>\\n\" +\n" +
                "        \"    <style>\\n\" +\n" +
                "        \"        *{\\n\" +\n" +
                "        \"            box-sizing: border-box;\\n\" +\n" +
                "        \"            font-family: Comfortaa;\\n\" +\n" +
                "        \"        }\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        /* Main Body Styling */\\n\" +\n" +
                "        \"        body{\\n\" +\n" +
                "        \"            height: 100vh;\\n\" +\n" +
                "        \"            background-color: rgb(212, 222, 230);\\n\" +\n" +
                "        \"            display: flex;\\n\" +\n" +
                "        \"            align-items: center;\\n\" +\n" +
                "        \"            justify-content: center;\\n\" +\n" +
                "        \"        }\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        /* <!-- Wrapper -->*/\\n\" +\n" +
                "        \"        .wrapper{\\n\" +\n" +
                "        \"            width: 550px;\\n\" +\n" +
                "        \"            height: auto;\\n\" +\n" +
                "        \"            padding: 15px;\\n\" +\n" +
                "        \"            background-color: white;\\n\" +\n" +
                "        \"            border-radius: 7px;\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        }\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        /* <!-- Email MSG Header --> */\\n\" +\n" +
                "        \"        .email-msg-header{\\n\" +\n" +
                "        \"            text-align: center;\\n\" +\n" +
                "        \"        }\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        /* <!-- Company Name --> */\\n\" +\n" +
                "        \"        .company-name{\\n\" +\n" +
                "        \"            width: 100%;\\n\" +\n" +
                "        \"            font-size: 35px;\\n\" +\n" +
                "        \"            color: gray;\\n\" +\n" +
                "        \"            text-align: center;\\n\" +\n" +
                "        \"        }\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        /* <!-- Welcome Text --> */\\n\" +\n" +
                "        \"        .welcome-text{\\n\" +\n" +
                "        \"            text-align: center;\\n\" +\n" +
                "        \"        }\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        /* <!-- Verify Account Button --> */\\n\" +\n" +
                "        \"        .verify-account-btn{\\n\" +\n" +
                "        \"            padding: 15px;\\n\" +\n" +
                "        \"            background-color: rgb(0, 109, 252);\\n\" +\n" +
                "        \"            text-decoration: none;\\n\" +\n" +
                "        \"            color: white;\\n\" +\n" +
                "        \"            border-radius: 5px;\\n\" +\n" +
                "        \"        }\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        /* <!-- Copy Right Wrapper --> */\\n\" +\n" +
                "        \"        .copy-right{\\n\" +\n" +
                "        \"            padding: 15px;\\n\" +\n" +
                "        \"            color: gray;\\n\" +\n" +
                "        \"            font-size: 14px;\\n\" +\n" +
                "        \"            margin: 20px 0px;\\n\" +\n" +
                "        \"            display: flex;\\n\" +\n" +
                "        \"            align-items: center;\\n\" +\n" +
                "        \"            justify-content: center;\\n\" +\n" +
                "        \"        }\\n\" +\n" +
                "        \"    </style>\\n\" +\n" +
                "        \"</head>\\n\" +\n" +
                "        \"<body>\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"    <!-- Wrapper -->\\n\" +\n" +
                "        \"    <div class='wrapper'>\\n\" +\n" +
                "        \"        <!-- Email MSG Header -->\\n\" +\n" +
                "        \"        <h2 class='email-msg-header'>\\n\" +\n" +
                "        \"            Welcome and Thank You for Choosing  \\n\" +\n" +
                "        \"        </h2>\\n\" +\n" +
                "        \"        <!-- End Of Email MSG Header -->\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        <!-- Company Name -->\\n\" +\n" +
                "        \"        <div class='company-name'>Easy Way Bank</div>\\n\" +\n" +
                "        \"        <!-- End Of Company Name -->\\n\" +\n" +
                "        \"        <hr>\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        <!-- Welcome Text -->\\n\" +\n" +
                "        \"        <p class='welcome-text'>\\n\" +\n" +
                "        \"            Your Account has been successfully registered, please click below to verify your account \\n\" +\n" +
                "        \"        </p>\\n\" +\n" +
                "        \"        <!-- End Of Welcome Text -->\\n\" +\n" +
                "        \"        <br>\\n\" +\n" +
                "        \"        <br>\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        <!-- Verify Account Button -->\\n\" +\n" +
                "        \"        <center><a href='\"+ url +\"' class='verify-account-btn' role='button'>Verify Account</a></center>\\n\" +\n" +
                "        \"        <!-- End Of Verify Account Button -->\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"        <!-- Copy Right Wrapper -->\\n\" +\n" +
                "        \"        <div class='copy-right'>\\n\" +\n" +
                "        \"            &copy; Copy Right 2021. All Rights Reserved.\\n\" +\n" +
                "        \"        </div>\\n\" +\n" +
                "        \"        <!-- End Of Copy Right Wrapper -->\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"    </div>\\n\" +\n" +
                "        \"    <!-- End Of Wrapper -->\\n\" +\n" +
                "        \"\\n\" +\n" +
                "        \"    \\n\" +\n" +
                "        \"</body>\\n\" +\n" +
                "        \"</html>\";\n";
        return "";
    }
}
