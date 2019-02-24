<?php
    include 'connection.php';
    $var_user = $_POST['username'];
    $var_pass = $_POST['message'];
    $var_nickname = $_POST['recipient'];
    $var_gender = $_POST['emotion'];
    $var_avatar = $_GET['avatar'];

    if(!mysqli_connect_errno()){
        $data = 0;

        $query = mysqli_prepare($conn, "INSERT INTO thread(username,message_body,recipient,emotion_status,avatar)VALUES(?,?,?,?,?)");
        mysqli_stmt_bind_param($query, "sssss", $var_user, $var_pass, $var_nickname,$var_gender,$var_avatar);
        mysqli_stmt_execute($query);

        $query->bind_result($result);
        $query->fetch();

        echo "1";
        mysqli_stmt_close($query);
        $conn->close();
    }else{
        
    }

    ?>