$(function () {
    $("#user").click();
})
// 面试人员列表
$("#user").click(function () {
    $.ajax({
        url: "/getUser",
        type: "GET",
        success: function (data) {
            var tab = $("#userTab");
            tab.empty();
            var head = $("<tr></tr>");
            $("<th></th>").append("姓名").appendTo(head);
            $("<th></th>").append("学校").appendTo(head);
            $("<th></th>").append("专业").appendTo(head);
            $("<th></th>").append("电话").appendTo(head);
            $("<th></th>").append("邮箱").appendTo(head);
            $("<th></th>").append("面试岗位").appendTo(head);
            $("<th></th>").append("笔试分数").appendTo(head);
            $("<th></th>").append("试卷").appendTo(head);
            tab.append(head);
            $.each(data, function (index, user) {
                var line = $("<tr></tr>");
                $("<td></td>").append(user.name).appendTo(line);
                $("<td></td>").append(user.school).appendTo(line);
                $("<td></td>").append(user.major).appendTo(line);
                $("<td></td>").append(user.phone).appendTo(line);
                $("<td></td>").append(user.email).appendTo(line);
                $("<td></td>").append(user.post).appendTo(line);
                $("<td></td>").append((user.choiceSumScore + user.judgeSumScore + user.choicesSumScore)).appendTo(line);
                $("<td></td>").append($("<a>查看</a>").attr("target", "_blank").attr("href", "/getUserExa?userFlag=" + user.userFlag)).appendTo(line);
                tab.append(line);
            });
        }
    });
});