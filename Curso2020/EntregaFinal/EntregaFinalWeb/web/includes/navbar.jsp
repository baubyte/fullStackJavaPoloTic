<%-- 
    Document   : navbar.jsp
    Created on : 14/12/2020, 21:43:34
    Author     : Pared Baez Martin Jose<paredbaez.martin@gmail.com>
--%>
<nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top bg-dark" id="navigation-example">
    <div class="container-fluid">
        <div class="navbar-wrapper">
            <a class="navbar-brand" href="javascript:void(0)">Dashboard</a>
        </div>
        <button class="navbar-toggler" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation" data-target="#navigation-example">
            <span class="sr-only">Toggle navigation</span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" id="navbarDropdownMenuUsers" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" href="#">
                        <i class="material-icons">fingerprint</i>
                        <p class="d-lg-none d-md-block">
                            Usuario
                        </p>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuUsers">
                        <a class="dropdown-item" href="">Cambiar Contraseña</a>
                        <a class="dropdown-item" href="">Cerrar Sesión</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>

