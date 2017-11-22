var maxtime;
if (window.name == '') {
    maxtime = 45 * 60;
} else {
    maxtime = window.name;
}

function CountDown() {
    if (maxtime >= 0) {
        minutes = Math.floor(maxtime / 60);
        seconds = Math.floor(maxtime % 60);
        msg = "距离考试结束还有<b>" + minutes + "</b>分<b>" + seconds + "</b>秒";
        document.all["timer"].innerHTML = msg;
        if (maxtime == 5 * 60) alert('注意，还有5分钟!');
        --maxtime;
        window.name = maxtime;
    }
    else {
        clearInterval(timer);
        window.history.forward(this.href);
        $("#userExaForm").submit();
        alert("考试时间到，试卷已提交!");
    }
}

timer = setInterval("CountDown()", 1000);