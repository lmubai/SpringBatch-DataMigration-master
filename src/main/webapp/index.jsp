<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<center>
    <h2>数据迁移管理平台(线下)</h2>

    <table border="1">
        <tr>
            <th>任务编号</th>
            <th>任务名称</th>
            <th>操作</th>
        </tr>
        <form action="${pageContext.request.contextPath}/executeJob" method="get">
            <tr>
                <input type="hidden" name="jobName" value="userBatchJobTestName">
                <td>1</td>
                <td>userBatchJobName</td>
                <td><input type="submit" value="启动"></td>
            </tr>
        </form>
    </table>


</center>
</body>
</html>
