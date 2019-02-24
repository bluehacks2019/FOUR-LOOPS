<?php
    include 'connection.php';
    $var_user = $_GET['username'];
    $var_pass = $_GET['password'];
    $var_nickname = $_GET['nickname'];
    $var_gender = $_GET['gender'];

    if(!mysqli_connect_errno()){
        $data = 0;

        $query = mysqli_prepare($conn, "INSERT INTO login_user(username,password,nickname,gender)VALUES(?,?,?,?)");
        mysqli_stmt_bind_param($query, "ssss", $var_user, $var_pass, $var_nickname,$var_gender);
        mysqli_stmt_execute($query);

        $query->bind_result($result);
        $query->fetch();

        echo "inserted";
        mysqli_stmt_close($query);
        $conn->close();
    }else{
        
    }

    ?>