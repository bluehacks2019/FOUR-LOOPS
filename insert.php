<?php
    include 'connection.php';

    $var_module = $_GET['module'];
    $var_date = $_GET['dateopen'];
    $var_time = $_GET['timeopen'];

    if(!mysqli_connect_errno()){
        $data = 0;

        $query = mysqli_prepare($conn, "INSERT INTO progress(module,dateOpen,timeOpen)VALUES(?,?,?)");
        mysqli_stmt_bind_param($query, "sss", $var_module, $var_date, $var_time);
        mysqli_stmt_execute($query);

        $query->bind_result($result);
        $query->fetch();

        echo "inserted";
        mysqli_stmt_close($query);
        
    }else{
    
    }
    $conn->close();

?>