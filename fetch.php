<?php
//these are the server details
//the username is root by default in case of xampp
//password is nothing by default
//and lastly we have the database named android. if your database name is different you have to change it 
include 'connection.php';
//if everything is fine
//creating an array for storing the data 
//this is our sql query 
$sqlAll = "SELECT * FROM progress;";
$resultAll = $conn->query($sqlAll);
$queryAll=$resultAll->num_rows;

$sqlInt = "SELECT * FROM progress where module='Intellectual';";
$resultInt = $conn->query($sqlInt);
$queryInt=$resultInt->num_rows;

$sqlSoc = "SELECT * FROM progress where module='Social';";
$resultSoc = $conn->query($sqlSoc);
$querySoc=$resultSoc->num_rows;

$sqlSpirit = "SELECT * FROM progress where module='Spiritual';";
$resultSpirit = $conn->query($sqlSpirit);
$querySpirit=$resultSpirit->num_rows;

$sqlPhy = "SELECT * FROM progress where module='Physical';";
$resultPhy = $conn->query($sqlPhy);
$queryPhy=$resultPhy->num_rows;
 
//executing that statment
//while ($ctr[]=$result->fetch_assoc()){
//	$data = $ctr;
//	$json = json_encode($data);
//}
 
//$json = str_replace("[", "", $json);
//$json = str_replace("]", "", $json);
if($queryAll=="0"){

}
else{
	$IntPercent=number_format($queryInt) / number_format($queryAll);
	$SocPercent=number_format($querySoc) / number_format($queryAll);
	$SpiritPercent=number_format($querySpirit) / number_format($queryAll);
	$PhysicPercent=number_format($queryPhy) / number_format($queryAll);
	$TotalInt=number_format($IntPercent,3) * 100;
	$TotalSoc=number_format($SocPercent,3) * 100;
	$TotalSpi=number_format($SpiritPercent,3) * 100;
	$TotalPhy=number_format($PhysicPercent,3) * 100;

	echo '[{"Int":"'.$TotalInt.'",';
	echo '"Soc":"'.$TotalSoc.'",';
	echo '"Spi":"'.$TotalSpi.'",';
	echo '"Phy":"'.$TotalPhy.'"}]';
}
$conn->close();
?>