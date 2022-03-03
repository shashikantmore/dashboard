$(document).ready(function() {
    console.log("loading");
    $('#example').DataTable();
    $('#time').timepicker({format: 'hh:mm:ss a'});

//    var date_input=$('.input-group.date'); //our date input has the name "date"
//          var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
//          var options={
//            format: 'mm/dd/yyyy',
//            container: container,
//            todayHighlight: true,
//            autoclose: true,
//          };
//          date_input.datepicker(options);

} );