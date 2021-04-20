<!doctype html>
<html lang="es">

<head>
    <title>Nuevo Empleado</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/logo.png">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <!--     Fonts and icons     -->
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
    <!-- Material Kit CSS -->
    <link href="assets/css/material-dashboard.css?v=2.1.0" rel="stylesheet" />

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
            <?php include 'sidebar.php' ?>
            <!-- /Fin Sidebar -->

        </div>
        <div class="main-panel">
            <!-- Navbar -->
            <?php include 'navbar.php' ?>
            <!-- /Fin Navbar -->
            <div class="content">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12">
                            <div class="card">
                                <div class="card-header card-header-success">
                                    <h4 class="card-title">Nuevo Empleado</h4>
                                    <p class="card-category">Complete los Campos</p>
                                </div>
                                <div class="card-body">
                                    <form method="POST" action="">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <div class="form-group has-success">
                                                    <label class="bmd-label-floating">Nombre</label>
                                                    <input type="text" class="form-control" name="nombre" id="nombre" required>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group has-success">
                                                    <label class="bmd-label-floating">Apellido</label>
                                                    <input type="text" class="form-control" name="apellido" id="apellido" required>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group has-success">
                                                    <label class="bmd-label-floating">Nº Documento</label>
                                                    <input type="text" class="form-control" name="dni" id="dni" required>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group has-success">
                                                    <label class="bmd-label-floating">Teléfono</label>
                                                    <input type="text" class="form-control" name="telefono" id="telefono">
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <label>Dirección</label>
                                                    <div class="form-group has-success">
                                                        <label class="bmd-label-floating">Domicilio Completo</label>
                                                        <textarea class="form-control" rows="1" name="direccion" id="direccion"></textarea>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group has-success">
                                                    <label class="bmd-label-floating">Email</label>
                                                    <input type="email" class="form-control" name="email" id="email" required>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group has-success">
                                                    <label class="bmd-label-floating">Usuario</label>
                                                    <input type="text" class="form-control" name="usuario" id="usuario" required>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group has-success">
                                                    <label class="bmd-label-floating">Contraseña</label>
                                                    <input type="password" class="form-control" name="password" id="password" required>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group has-success">
                                                    <label class="bmd-label-floating">Rol</label>
                                                    <select name="rol" id="rol" class="form-control">
                                                        <option value="0" selected >Seleccione un Rol</option>
                                                        <option value="1">Administrador</option>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                        <button type="submit" class="btn btn-success pull-right">Guardar</button>
                                        <a href="#" class="btn btn-danger fa-pull-right">Cancelar</a>
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
    <script src="./assets/js/core/jquery.min.js"></script>
    <script src="./assets/js/core/popper.min.js"></script>
    <script src="./assets/js/core/bootstrap-material-design.min.js"></script>
    <script src="https://unpkg.com/default-passive-events"></script>
    <script src="./assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
    <!-- Place this tag in your head or just before your close body tag. -->
    <script async defer src="https://buttons.github.io/buttons.js"></script>
    <!--  Google Maps Plugin    -->
    <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
    <!-- Chartist JS -->
    <script src="./assets/js/plugins/chartist.min.js"></script>
    <!--  Notifications Plugin    -->
    <script src="./assets/js/plugins/bootstrap-notify.js"></script>
    <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
    <script src="./assets/js/material-dashboard.js?v=2.1.0"></script>
    <!-- Material Dashboard DEMO methods, don't include it in your project! -->
    <script src="./assets/demo/demo.js"></script>
    <script src="./assets/js/main.js"></script>
</body>

</html>