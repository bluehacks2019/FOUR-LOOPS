<?php
    include 'connection.php';
    $var_user = $_GET['emotion'];
    $var_pass = $_GET['location'];
    $var_nickname = $_GET['thread_topic'];
    $var_avatar = $_GET['avatar'];

    if(!mysqli_connect_errno()){
        $data = 0;

        $query = mysqli_prepare($conn, "INSERT INTO queueing(emotion,location_user,thread_topic, avatar)VALUES(?,?,?,?)");
        mysqli_stmt_bind_param($query, "sssi", $var_user, $var_pass, $var_nickname, $var_avatar);
        mysqli_stmt_execute($query);

        $query->bind_result($result);
        $query->fetch();

        echo "1";
        mysqli_stmt_close($query);
        $conn->close();
    }else{
        
    }

    ?>