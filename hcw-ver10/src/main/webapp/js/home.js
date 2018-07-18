/*************************导航栏部分开始*******************************/
/**
 * 隐藏导航栏,实现浏览器滚到到一定px则下滑出现隐藏导航栏
 */
function moveHCW(){
	var moveDiv = setInterval(function(){
		//获取#moveHCW的left初始值
		var initLeft = parseInt($("#moveHCW").css("left").replace("px",""));
		console.log("初始PX值: "+initLeft);
		if(initLeft<=-23){
			initLeft+=1;
			console.log(initLeft);
			$("#moveHCW").css("left",initLeft+"px");
		}else{
			clearInterval(moveDiv);
			moveCar();
		}
	},1000/40);
}

function moveCar(){
	var moveImg = setInterval(function(){
		//获取#moveHCW的left初始值
		var initLeft = parseInt($("#movingCar").css("left").replace("px",""));
		console.log("初始PX值: "+initLeft);
		if(initLeft<=540){
			initLeft+=1;
			console.log(initLeft);
			$("#movingCar").css("left",initLeft+"px");
		}else{
			clearInterval(moveImg);
		}
	},1000/20);
}
$(function(){
	$(".hideNav").hide();
	$(window).scroll(function(){
		if($(document).scrollTop()>=150){
			$(".hideNav").addClass("fixNav").slideDown();
			moveHCW();
		}else{
			$(".hideNav").hide();
		}
	});
	
});


/*************************导航栏部分开始*******************************/

/**
 * 秒杀倒计时的方法
 */
function countTime(){
	var curTime = new Date();
	var target = new Date("2018/8/10 10:00:00");
	var gap = target-curTime;
	var sec = Math.floor(gap/1000);
	var day = Math.floor(Math.floor(Math.floor(sec/60)/60)/24);
	var hours = Math.floor(Math.floor(sec/60)/60)%24;
	var minutes = Math.floor(sec/60)%60;
	var seconds = sec%60;
	var notice = "秒杀进行中，距结束还有";
	var msg = document.getElementById("timeCount");
	if(minutes<10){
		minutes="0"+minutes;
	}else if(seconds<10){
		seconds = "0"+seconds;
	}else if(hours<10){
		hours="0"+hours;
	}
	if(gap<=0){
		notice="本场秒杀结束,敬请期待下一场!"
		clearInterval(timeCount);
	}
	msg.innerHTML = "<span id='seckill'>"+notice+" </span>"+"<span class='timeCount'>"+hours+"</span><b>:</b>"+
	"<span class='timeCount'>"+minutes+"</span><b>:</b>"+"<span class='timeCount'>"+seconds+"</span>";
}

onload=function(){
	var timeCount = setInterval(countTime, 1000);
}
/*
 * BootStrap中的提示框代码
 */
$(function () { $("[data-toggle='tooltip']").tooltip(); });

/*
 *跟随鼠标移动的动态图 
 */
$(function(){
	var i=0;
	$(".rollingPcsDiv").each(function(){
		var move = i*266+"px";
		$(this).css("left",move);
		i++;
	});
	/* 
	*图片跟随鼠标移动的方法
	*/
	$("#rolling").mousemove(function(e) {
		var x = e.originalEvent.x || e.originalEvent.layerX || 0;//获取鼠标坐标
		$("#moving").css("left",-x/4+"px");
	});
});
