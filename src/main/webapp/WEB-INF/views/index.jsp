<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index Page</title>
</head>
<body>
    <h1>Welcome to the E-commerce Site</h1>
    <div>
        <c:forEach var="product" items="${products}">
            <div>
                <%-- <%-- <img src="${product.}" alt="${product.name}" /> --%> --%>
                <h2>${product.name}</h2>
                <p>${product.description}</p>
                <p>Price: $${product.price}</p>
                <p>Stocks: ${product.stockQuantity}</p>
                <button onclick="location.href='/cart/add/${product.productId}'">Add to Cart</button>
            </div>
        </c:forEach>
    </div>
    <a href="/cart/">Go to Cart</a>
</body>
</html>
