/**
 * categroy list
 */
$(function() {
	$.getJSON("${pageContext.request.contextPath}/",function(data) {
				console.log("getCategroys被调用了")
				$.each(
					data,
					function(i, n) {
						if(i) {
								$("#list")
									.append(
										'<li><a href="${pageContext.request.contextPath}/categroyServlet?method=showProductsByCid&cid=' +
										n.cid +
										'&currentID=1">' +
										n.cname +
										'</a></li>')
						} else {
								$("#list").append(
										'<li class="active"><a href="${pageContext.request.contextPath}/categroyServlet?method=showProductsByCid&cid=' +
										n.cid +
										'&currentID=1">' +
										n.cname +
										'<span class="sr-only">(current)</span></a></li>"');
						}
					}
				);
			});
});