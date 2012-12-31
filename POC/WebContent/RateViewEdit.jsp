<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="HeadContent.jsp" />

</head>
<body>

	<jsp:include page="Header.jsp" />
	<jsp:include page="Menu.jsp" />

	<div class="container">
		<div class="row">
			<div class="span4">
			<h3>Enter details</h3>
			<table>
				<tr>
					<td>Tag: </td>
					<td><input type="text" id="tag_input" size="10"/></td>
				</tr>
				<tr>
					<td><input type="button" id="search" value="Search"/></td>
					<td><input type="button" id="reset" value="Reset"/></td>
				</tr>
			</table>
			
			</div>
			<div class="span10">
				<div id="post-container">
					<div id="post-6272" class="post">
						<h2>Test Facebook Entities by Tag</h2>
						<div id="post-meta"> 
							<span id="post-meta-author"> By <a href="#" rel="author">info</a> - June 8, 2010 </span> 
							<span class="post-tag"><a href="#" rel="tag">service link</a></span>
						</div>
							<div class="post-content">
								<div id="loadingDiv"><img src="images/loading.gif" alt="Loading" /></div>
							</div>
						

					</div>
				</div>
			</div>
		</div>
	</div>


	<jsp:include page="Footer.jsp" />
</body>
</html>