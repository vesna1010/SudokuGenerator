<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<div class="sudoku">
		<div class="table">
			<c:forEach var="i" begin="0" end="6" step="3">
				<div class="row">
					<c:forEach var="j" begin="0" end="6" step="3">
						<div class="cell">
							<div class="table">
								<c:forEach var="m" begin="${i}" end="${i+2}">
									<div class="row">
										<c:forEach var="n" begin="${j}" end="${j+2}">
											<div class="cell">
												<c:set var="key" value="${m += '' += n}"></c:set>
												<div class="div">${sudoku.map[key]}</div>
											</div>
										</c:forEach>
									</div>
								</c:forEach>
							</div>
						</div>
					</c:forEach>
				</div>
			</c:forEach>
		</div>
	</div>
	<br>
	<div class="sudoku">
		<button class="button"
			onclick="location.href='<c:url value="/sudoku"/>'">Generate
			Sudoku</button>
	</div>
</body>
</html>