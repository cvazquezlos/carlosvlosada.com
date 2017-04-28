<?php 
	require('email_config.php');
	
	$name = trim($_POST['name']);
	$email = trim($_POST['email']);
	$message = trim($_POST['message']);
	$error = "";

	$pattern = "^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$^";
	if(!preg_match_all($pattern, $email, $out)) {
		$error = $invalid_email;
	}
	if(!$email) {
		$error = $invalid_email;
	}	
	if(!$message) {
		$error = $invalid_message;
	}
	if (!$name) {
		$error = $invalid_name;
	}
	$headers = "From: ".$name." <".$email.">\r\nReply-To: ".$email."";
	if (!$error){
		$sent = mail($to_email,$subject,$message,$headers); 
		
		if ($sent) {
				echo "SEND"; 
			} else {
				echo $sending_error; 
			}
	} else {
		echo $error;
	}
?>