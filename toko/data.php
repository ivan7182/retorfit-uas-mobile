<?php


    require_once('connect.php');

    $query = "SELECT * FROM buku";
    $sql   = mysqli_query($db_connect, $query);
    
    $result = array();
    
    if ($sql) {
        $result = array();
        while($row = mysqli_fetch_array($sql)){
            array_push($result, array(
                'id' => $row['id'],
                'nama' => $row['nama'],
                'penulis' => $row['penulis'],
            ));
        }

        echo json_encode( array('toko' => $result));
    }


?>
