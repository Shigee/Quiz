//問題の取得
//正誤のアクション

//ページ読み込み時の表示
var counter = 1;
window.onload = function(){
	document.getElementById("text").innerHTML =("問題文の配列を取得したいけどできんLEVEL1");
	document.getElementById("level").innerHTML = ("★☆☆☆");
	document.getElementById("count").innerHTML = counter;
    counter++;
    console.log(counter)
}
//ゲーム進行中の表示
var btn_click = function(){
	if(counter < 4){
		document.getElementById("text").innerHTML =("問題文の配列を取得したいけどできんLEVEL1");
		document.getElementById("level").innerHTML = ("★☆☆☆");
		document.getElementById("count").innerHTML = counter;
		counter++;
	}else if(counter < 7){
		document.getElementById("text").innerHTML =("問題文の配列を取得したいけどできんLEVEL2");
		document.getElementById("level").innerHTML = ("★★☆☆");
		document.getElementById("count").innerHTML = counter;
		counter++;
	}
	else if(counter < 10){
		document.getElementById("text").innerHTML =("問題文の配列を取得したいけどできんLEVEL3");
		document.getElementById("level").innerHTML = ("★★★☆");
		document.getElementById("count").innerHTML = counter;
		counter++;
	}else if(counter == 10){
		document.getElementById("text").innerHTML =("問題文の配列を取得したいけどできんLEVEL4");
		document.getElementById("level").innerHTML = ("★★★★");
		document.getElementById("count").innerHTML = counter;
		counter++;
	}else{
		document.getElementById("end").innerHTML = ("終了！");
	}
}