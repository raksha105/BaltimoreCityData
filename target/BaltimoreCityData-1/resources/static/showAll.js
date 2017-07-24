
    
      $(document).ready(function() {
	$("#table").hide();
	$("#loading-btn").hide();
	$("#add-btn").click(function() {
	           window.location.href = 'http://localhost:8080/BaltimoreCityData/addRestaurant';

});


    $("#view-all-btn")
	    .click(
		    function() {

			$("#loading-btn").show();

			$
				.ajax({
				    type : "POST",
				    url : 'http://localhost:8080/BaltimoreCityData/ShowAllRestaurants',
				    dataType : "JSON",
				    success : function(data) {
					if (data) {
					    var len = data.length;
					    var txt = "";

					    alert(data);
					    if (len > 0) {

						for (var i = 0; i < len; i++) {

						    txt += "<tr><td>"
							    + data[i].name
							    + "</td><td>"
							    + data[i].zipcode
							    + "</td><td>"
							    + data[i].neighborhood
							    + "</td><td>"
							    + "<button type=\"button\" class=\"btn btn-danger\">Delete</button></td></tr>"

						}
						if (txt != "") {
						    $("#table").append(txt)
							    .show();
						}

					    }
					}
				    },

				    complete : function() {

					$("#loading-btn").hide();

				    }

				});
		    });
    });
