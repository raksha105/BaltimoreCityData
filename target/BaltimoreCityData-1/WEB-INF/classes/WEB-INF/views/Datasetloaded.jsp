<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>



<style>
.buttonload {
    background-color: #4CAF50; /* Green background */
    border: none; /* Remove borders */
    color: white; /* White text */
    padding: 12px 24px; /* Some padding */
    font-size: 16px; /* Set a font-size */
}

body { padding-top: 70px; }

</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">




<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
	
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
	
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Baltimore Restaurants</title>

<script type="text/javascript">
    
      $(document).ready(function() {

    		var s = document.getElementById('search')

    	 	$("#table").hide();
    		$("#loading-btn").hide();
    		
    		


    	    $("#search")
    		    .click(
    			    function() {
    		    		$("#addedMsg").hide();

    		
    			
    			  $.ajax({
    				     type: "GET",
    				     url: "http://localhost:8080/BaltimoreCityData/search",
    				     data: { "searchParam": $("#searchText").val() }, 
    			  		    success : function(data) {
    			  		    //alert(data);
    			  		    
    			  		    
    			  			if (data) {
    			  			    var len = data.length;
    			  			    var txt = "";
    			  			    if (len > 0) {
    			  				$("#table").empty();
    			  				txt+="<tr>"
    			  					+"<th>Name</th>"
    			  					+"<th>Zipcode</th>"
    			  					+"<th>Neighborhood</th>"
    			  					+"<th>Address</th>"

    			  				+"</tr>";
    			  				//alert(data);
    			  				for (var i = 0; i < len; i++) {
    			  				    
    			  				  txt += "<tr><td>"
    								    + data[i].name
    								    + "</td><td>"
    								    + data[i].zipcode
    								    + "</td><td>"
    								    + data[i].neighborhood
    								    + "</td><td>"
    								    +data[i].location_1_address
    								    +"</td><td>"
    								    + "<button type=\"button\" class=\"btn btn-danger\">Delete</button></td></tr>"

    			  				}
    			  				
    			  				if (txt != "") {
    			  				    $("#table").append(txt).show();
    			  				}
    			  			    }
    			  			    
    			  			    else{
    			  			    	
    			  			    	alert("Sorry, No Restaurant could be found with the given name");
    			  			    }
    			  			}
    			  		    
    			  		    
    			  		    
    			  		    }
    			  		    });
    			
    			
    		});
    		
    		
    		

	
	$("#add-btn").click(function() {
		
		
		$("#addedMsg").show();

        window.location.href = "http://localhost:8080/BaltimoreCityData/addRestaurant";




});
	



    $("#view-all-btn")
	    .click(
		    function() {
	    		$("#addedMsg").hide();


			$("#loading-btn").show();

			$
				.ajax({
				    type : "POST",
				    url : "http://localhost:8080/BaltimoreCityData/ShowAllRestaurants",
				    dataType : "JSON",
				    success : function(data) {
					if (data) {
					    var len = data.length;
					    var txt = "";
						

					    //alert(data);
					    if (len > 0) {

						for (var i = 0; i < len; i++) {

						    txt += "<tr><td>"
							    + data[i].name
							    + "</td><td>"
							    + data[i].zipcode
							    + "</td><td>"
							    + data[i].neighborhood
							    + "</td><td>"
							    +data[i].location_1_address
							    +"</td><td>"
							    + "<button type=\"button\" class=\"btn btn-danger\">Delete</button></td></tr>"

						}
						if (txt != "") {
						    $("#table").append(txt).show();
						}

					    }
					    
					    else{
					    	
					    	alert("Sorry data is empty !");
					    }
					}
				    },

				    complete : function() {

					$("#loading-btn").hide();

				    }

				});
		    });
    
    
	 function getEventTarget(e) {
    e = e || window.event;
    return e.target || e.srcElement; 
}

var ul = document.getElementById('filter')
ul.onclick = function(event) {
    var target = getEventTarget(event);
	$("#addedMsg").hide();

    //alert(target.innerHTML);
    $.ajax({
	     type: "GET",
	     url: "http://localhost:8080/BaltimoreCityData/FilterResults",
	     data: { "filter-param": target.innerHTML }, 
  		    success : function(data) {
  			
  			//alert(data);
  			
  			if (data) {
  			    var len = data.length;
  			    var txt = "";
  			    if (len > 0) {
  				$("#table").empty();
  				txt+="<tr>"
  					+"<th>Name</th>"
  					+"<th>Zipcode</th>"
  					+"<th>Neighborhood</th>"
  					+"<th>Address</th>"

  				+"</tr>";
  				//alert(data);
  				for (var i = 0; i < len; i++) {
  				    
  				  txt += "<tr><td>"
					    + data[i].name
					    + "</td><td>"
					    + data[i].zipcode
					    + "</td><td>"
					    + data[i].neighborhood
					    + "</td><td>"
					    +data[i].location_1_address
					    +"</td><td>"
					    + "<button type=\"button\" class=\"btn btn-danger\">Delete</button></td></tr>"

  				}
  				
  				if (txt != "") {
  				    $("#table").append(txt).show();
  				}
  			    }
  			    
  			    else{
  			    	
  			    	alert("Sorry data is empty !")
  			    }
  			}
  		    }
	});
    
    
};
    
    
 	$('#table').on('click', '.btn', function(){
		$("#addedMsg").hide();


var $name = $(this).closest("tr")   
                   .find('td:first')    
                   .text();   

var $zipcode = $(this).closest("tr")   
.find('td:eq(1)')    
.text(); 

var $neighborhood = $(this).closest("tr")   
.find('td:eq(2)')    
.text(); 
                   

 // alert($name+", "+$zipcode) ;
  $(this).closest("tr").remove();
  
  $.ajax({
	     type: "GET",
	     url: "http://localhost:8080/BaltimoreCityData/deleteRestaurant",
	     data: { "name": $name, "zipcode" : $zipcode, "neighborhood" : $neighborhood }, // parameters,
		    success : function(data) {
			
			alert("Deleted")
			
		    }
  });	
  
});   


 
 	

    });

      </script>


</head>


<body>

		<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Restaurants in Baltimore</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="javascript:;" id="view-all-btn">ViewRestaurants</a></li>
            <li><a href="javascript:;" id="add-btn">Add Your Own</a></li>
            <li>
				<div class="dropdown">
				  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					Sort By
					<span class="caret"></span></button>
				  </button>
				  <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="filter">
					<li><a href="javascript:;">Address</a></li>
					<li><a href="javascript:;">Neighborhood</a></li>
					<li><a href="javascript:;">Zipcode</a></li>
					<li><a href="javascript:;">Name</a></li>
				  </ul>
				</div>
			</li>
          </ul>
		  
		  <form class="navbar-form navbar-right" action="javascript:;">
            <div class="form-group">
              <input type="text" placeholder="Search by Name" class="form-control" id="searchText">
            </div>
            <button type="submit" class="btn btn-success" id="search">Search</button>
          </form>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

	

<div class="container">
	<div style="text-align:center;">
	  
	  <i class="fa fa-refresh fa-spin" style="font-size:50px; width:300px; margin: 0 auto" id="loading-btn""></i>
	  
	</div>
	<div class="container">
		<table id="table" class="table table-striped">

			<tr>
				<th>Name</th>
				<th>Zipcode</th>
				<th>Neighborhood</th>
								<th>Address</th>
				
			</tr>

		</table>
	</div>

      <h3><p style=text-align:center id="addedMsg"><b>${success}</b></p></h3>
    	
</div>

</body>
</html>