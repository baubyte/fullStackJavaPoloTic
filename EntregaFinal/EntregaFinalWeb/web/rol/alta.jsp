<%-- 
    Document   : index
    Created on : 14/12/2020, 21:50:16
    Author     : Pared Baez Martin Jose<paredbaez.martin@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="es">
    <head>
        <title>Roles</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/assets/img/logo.png">
        <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <!--     Fonts and icons     -->
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
        <!-- Material Kit CSS -->
        <link href="${pageContext.request.contextPath}/assets/css/material-dashboard.css?v=2.1.0" rel="stylesheet" />

    </head>
    <body class="dark-edition">
        <div class="wrapper ">
            <div class="sidebar" data-color="green" data-background-color="black" data-image="./assets/img/back-sidebar-1.jpg">
                <div class="logo">
                    <a href="/" class="simple-text logo-normal">
                        AdminPark
                    </a>
                </div>
                <!-- Sidebar -->
                <% String activerol = "active";%>
                <%@include file="../includes/sidebar.jsp" %>
                <!-- /Fin Sidebar -->

            </div>
            <div class="main-panel">
                <!-- Navbar -->
                <%@include file="../includes/navbar.jsp" %>
                <!-- /Fin Navbar -->
                <div class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12 col-md-12">
                                <div class="card">
                                    <div class="card-header card-header-success">
                                        <h4 class="card-title">Nuevo Rol</h4>
                                        <p class="card-category">Complete los Campos</p>
                                    </div>
                                    <div class="card-body">
                                        <form method="POST" action="">
                                            <div class="row">
                                                <div class="col-md-5">
                                                    <div class="form-group has-success">
                                                        <label class="bmd-label-floating">Nombre</label>
                                                        <input type="text" class="form-control" name="nombre" id="nombre">
                                                    </div>
                                                </div>
                                                <div class="col-md-7">
                                                    <div class="form-group">
                                                        <label>Descripción</label>
                                                        <div class="form-group has-success">
                                                            <label class="bmd-label-floating"> Breve Descripción del Rol (Permiso).</label>
                                                            <textarea class="form-control" rows="2" name="descripcion" id="descripcion"></textarea>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <button type="submit" class="btn btn-success pull-right">Guardar</button>
                                            <a href="${pageContext.request.contextPath}/rol" class="btn btn-danger fa-pull-right">Cancelar</a>
                                            <div class="clearfix"></div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <footer class="footer">
                    <div class="container-fluid">
                        <nav class="float-left">
                            <ul>
                                <li>
                                    <a href="https://github.com/baubyte/fullStackJavaPoloTic">
                                        FullStack Java PoloTic Misiones
                                    </a>
                                </li>
                                <li>
                                    <a href="https://github.com/baubyte" target="_blank">
                                        <i class="material-icons">touch_app</i> Hecho por Pared Baez
                                    </a>
                                </li>
                            </ul>
                        </nav>
                        <div class="copyright float-right">
                            &copy;
                            <script>
                                document.write(new Date().getFullYear())
                            </script>, Template <i class="material-icons">favorite</i>
                            <a href="https://www.creative-tim.com" target="_blank">Creative Tim</a>

                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <!--   Core JS Files   -->
        <script src="${pageContext.request.contextPath}/assets/js/core/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/core/popper.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/core/bootstrap-material-design.min.js"></script>
        <script src="https://unpkg.com/default-passive-events"></script>
        <script src="${pageContext.request.contextPath}/assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
        <!-- Place this tag in your head or just before your close body tag. -->
        <script async defer src="https://buttons.github.io/buttons.js"></script>
        <!--  Google Maps Plugin    -->
        <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
        <!-- Chartist JS -->
        <script src="${pageContext.request.contextPath}/assets/js/plugins/chartist.min.js"></script>
        <!--  Notifications Plugin    -->
        <script src="${pageContext.request.contextPath}/assets/js/plugins/bootstrap-notify.js"></script>
        <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
        <script src="${pageContext.request.contextPath}/assets/js/material-dashboard.js?v=2.1.0"></script>
        <!-- Material Dashboard DEMO methods, don't include it in your project! -->
        <script src="${pageContext.request.contextPath}/assets/demo/demo.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
    </body>

</html>
