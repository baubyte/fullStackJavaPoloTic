<!doctype html>
<html lang="es">

<head>
    <title>Clientes</title>
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
                        <div class="col-md-12">
                        <a href="#" class="btn btn-lg btn-success"><i class="material-icons">person_pin</i> Nuevo Cliente</a>
                            <div class="card">
                                <div class="card-header card-header-success">
                                    <h4 class="card-title ">Clientes</h4>
                                </div>
                                <div class="card-body">
                                    <div class="table-responsive">
                                        <table class="table table-hover">
                                            <thead class="text-success">
                                                <th>
                                                    #
                                                </th>
                                                <th>
                                                    Nombre
                                                </th>
                                                <th>
                                                    Apellido
                                                </th>
                                                <th>
                                                    DNI
                                                </th>
                                                <th>
                                                    Teléfono
                                                </th>
                                                <th>
                                                    Dirección
                                                </th>
                                                <th>
                                                    Email
                                                </th>
                                                <th>
                                                    Nº Tarjeta
                                                </th>
                                                <th>
                                                    Opciones
                                                </th>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>
                                                        1
                                                    </td>
                                                    <td>
                                                        Dakota Rice
                                                    </td>
                                                    <td>
                                                        Niger
                                                    </td>
                                                    <td>
                                                        12345678
                                                    </td>
                                                    <td>
                                                        12345678
                                                    </td>
                                                    <td>
                                                        Calle 1
                                                    </td>
                                                    <td>
                                                       emple@email.com
                                                    </td>
                                                    <td>
                                                       1111 1111 111 111
                                                    </td>
                                                    <td class="td-actions">
                                                        <button type="button" rel="tooltip" title="Editar Cliente" class="btn btn-white btn-link btn-sm">
                                                            <i class="material-icons">edit</i>
                                                        </button>
                                                        <button type="button" rel="tooltip" title="Borrar Cliente" class="btn btn-white btn-link btn-sm">
                                                            <i class="material-icons">close</i>
                                                        </button>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
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