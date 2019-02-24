<?php
    include 'connection.php';
    $var_user = $_GET['username'];
    $var_pass = $_GET['password'];

    if(!mysqli_connect_errno()){
        $data = 0;

        $query = mysqli_prepare($conn, "SELECT COUNT(*) FROM login_user WHERE username=? AND password=?");
        mysqli_stmt_bind_param($query, "ss", $var_user, $var_pass);
        mysqli_stmt_execute($query);

        $query->bind_result($result);
        $query->fetch();

        mysqli_stmt_close($query);
        if($result=="1"){
            $query1 = mysqli_prepare($conn, "SELECT COUNT(*) FROM login_user WHERE username=? AND password=?");
            mysqli_stmt_bind_param($query1, "ss", $var_user, $var_pass);
            mysqli_stmt_execute($query1);

            $query1->bind_result($resulted);
            $query1->fetch();

            echo $result;

            mysqli_stmt_close($query1);
        }
        else{
            echo "0";
        }
        $conn->close();
    }else{
        
    }

    ?>