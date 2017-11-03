var intDiff = parseInt(60*60);//倒计时总秒数量
function timer(intDiff) {
    var t = window.setInterval(function () {
        var hour = 0,
            minute = 0,
            second = 0;//时间默认值
        if (intDiff > 0) {
            hour = Math.floor(intDiff / (60 * 60));
            minute = Math.floor(intDiff / 60) - (hour * 60);
            second = Math.floor(intDiff) - (hour * 60 * 60) - (minute * 60);
        }
        if (minute <= 9) minute = '0' + minute;
        if (second <= 9) second = '0' + second;
        $('#hour_show').html('<s id="h"></s>' + hour + '时');
        $('#minute_show').html('<s></s>' + minute + '分');
        $('#second_show').html('<s></s>' + second + '秒');
        intDiff--;
        if (hour == 0 && minute == 0 && second == 0) {
            alert("考试时间到,试卷已提交");
            window.clearInterval(t);
            $("#userExaForm").submit();
        }
    }, 1000);
}