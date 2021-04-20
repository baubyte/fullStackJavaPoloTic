<%-- 
    Document   : sidebar.jsp
    Created on : 14/12/2020, 21:40:38
    Author     : Pared Baez Martin Jose<paredbaez.martin@gmail.com>
--%>
<div class="sidebar" data-color="green" data-background-color="black" data-image="${pageContext.request.contextPath}/assets/img/back-sidebar-1.jpg">
    <div class="logo">
        <a href="/" class="simple-text logo-normal">
            AdminPark
        </a>
    </div>
    <div class="sidebar-wrapper">
        <ul class="nav">
            <li class="nav-item active">
                <a class="nav-link" href="/">
                    <i class="material-icons">dashboard</i>
                    <p>Dashboard</p>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/rol/index.jsp">
                    <i class="material-icons">privacy_tip</i>
                    <p>Roles</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="#">
                    <i class="material-icons">account_box</i>
                    <p>Empleados</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="#">
                    <i class="material-icons">fingerprint</i>
                    <p>Usuarios</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="#">
                    <i class="material-icons">person_pin</i>
                    <p>Clientes</p>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">
                    <i class="material-icons">sticky_note_2</i>
                    <p>Entradas</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="#">
                    <i class="material-icons">videogame_asset</i>
                    <p>Juegos</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="#">
                    <i class="material-icons">alarm_on</i>
                    <p>Horarios Juegos</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="">
                    <i class="material-icons">menu_book</i>
                    <p>Reportes</p>
                </a>
            </li>
        </ul>
    </div>
</div>