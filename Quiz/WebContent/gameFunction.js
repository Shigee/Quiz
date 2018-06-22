//問題の取得


//問題テキストの表示

//正誤のアクション


//問題数（ページ読み込み時、１を表示）
var counter = 1;
window.onload = function(){
	document.getElementById("count").innerHTML = counter;
    counter++;
}

//問題数カウンター(ボタン押したとき)
  var btn_click = function(){
    if(counter <= 10){
      document.getElementById("count").innerHTML = counter;
      counter++;
    }else{
      document.getElementById("end").innerHTML = "終了！";
    }
  }