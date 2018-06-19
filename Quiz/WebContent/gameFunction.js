var counter = 2;
  var test = function(){
    if(counter <= 10){
      document.getElementById("count").innerHTML = counter;
      counter++;
    }else{
      document.getElementById("end").innerHTML = "終了！";
    }
  }