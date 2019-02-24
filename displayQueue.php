<?php
include 'connection.php';
$query = "SELECT emotion,location_user,thread_topic,nickname,avatar FROM queueing ORDER BY entry_id DESC";
$result = $conn->query($query);
 
//executing that statment
while ($ctr[]=$result->fetch_assoc()){
	$data = $ctr;
	$json = json_encode($data);
}

$json = str_replace("[", "", $json);
$json = str_replace("]", "", $json);

 

echo $json;
$conn->close();
?>