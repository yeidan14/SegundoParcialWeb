<%-- 
    Document   : principal
    Created on : 10/11/2019, 05:42:29 PM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Meta -->
    <meta name="description" content="Responsive Bootstrap 4 Dashboard and Admin Template">
    <meta name="author" content="ThemePixels">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="Librerias/assets/img/favicon.png">

    <title>Principal</title>

    <!-- vendor css -->
    <link href="Librerias/@fortawesome/fontawesome-free/css/all.min.css" rel="stylesheet">
    <link href="Librerias/ionicons/css/ionicons.min.css" rel="stylesheet">
    <link href="Librerias/jqvmap/jqvmap.min.css" rel="stylesheet">

    <!-- template css -->
    <link rel="stylesheet" href="Librerias/assets/css/cassie.css">
  </head>
  <body>

    <div class="sidebar">
      <div class="sidebar-header">
        <div>
          <a href="Librerias/index.html" class="sidebar-logo"><span>Segundo Parcial</span></a>
          <small class="sidebar-logo-headline">Yeison Daniel Manrique Camacho 1150966</small>
        </div>
      </div><!-- sidebar-header -->
      <div id="dpSidebarBody" class="sidebar-body">
        <ul class="nav nav-sidebar">
          <li class="nav-label"><label class="content-label">Paginas Necesarias</label></li>
          <li class="nav-item show">
            <a href="" class="nav-link with-sub active"><i data-feather="box"></i> Dashboard</a>
            <nav class="nav nav-sub">
              <a href="index.jsp" class="nav-sub-link active">Pagina en Blanco</a>
              <a href="Login.jsp" class="nav-sub-link">Login</a>
              <a href="Agregar.jsp" class="nav-sub-link">Agregar</a>
              <a href="editar.jsp" class="nav-sub-link">Editar</a>
               <a href="Listar.jsp" class="nav-sub-link">Listar</a>
            </nav>
          </li>
          
          <li class="nav-item">
            <a href="" class="nav-link with-sub"><i data-feather="lock"></i> Authentication</a>
            <nav class="nav nav-sub">
              <a href="Login.jsp" class="nav-sub-link">Inicio</a>
              <a href="Registro.jsp" class="nav-sub-link">Registro</a>             
            </nav>
          </li>
          <li class="nav-item">
            <a href="" class="nav-link with-sub"><i data-feather="x-circle"></i> Error Pages</a>
            <nav class="nav nav-sub">
              <a href="page-404.jsp" class="nav-sub-link">Page Not Found</a>
              <a href="page-500.jsp" class="nav-sub-link">Internal Server Error</a>
              <a href="page-503.jsp" class="nav-sub-link">Service Unavailable</a>
              <a href="page-505.jsp" class="nav-sub-link">Forbidden Access</a>
            </nav>
          </li>
          
          
        </ul>


      </div>
    </div><!-- sidebar -->

    <div class="content">
      <div class="header">
        <div class="header-left">
          <a href="" class="burger-menu"><i data-feather="menu"></i></a>

          
        </div><!-- header-left -->

        <div class="header-right">
          
          <div class="dropdown dropdown-notification">
            
            
          </div>
          <div class="dropdown dropdown-loggeduser">
            <a href="" class="dropdown-link" data-toggle="dropdown">
              <div class="avatar avatar-sm">
                <img src="https://via.placeholder.com/500/637382/fff" class="rounded-circle" alt="">
              </div><!-- avatar -->
            </a>
            <div class="dropdown-menu dropdown-menu-right">
              <div class="dropdown-menu-header">
                <div class="media align-items-center">
                  <div class="avatar">
                    <img src="https://via.placeholder.com/500/637382/fff" class="rounded-circle" alt="">
                  </div><!-- avatar -->
                  <div class="media-body mg-l-10">
                    <h6>Usuario</h6>
                    <span>Administrator</span>
                  </div>
                </div><!-- media -->
              </div>
              <div class="dropdown-menu-body">
               
                <a href="" class="dropdown-item"><i data-feather="log-out"></i> Salir</a>
              </div>
            </div><!-- dropdown-menu -->
          </div>
        </div><!-- header-right -->
      </div><!-- header -->
      <div class="content-header">
        <div>
          <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
              <li class="breadcrumb-item" aria-current="page"><a href="#">Pagina en Blanco</a></li>
              
            </ol>
          </nav>
          <h4 class="content-title content-title-xs"></h4>
        </div>
      </div><!-- content-header -->
      <div class="content-body">

          
      </div><!-- content-body -->
    </div><!-- content -->

    <script src="Librerias/jquery/jquery.min.js"></script>
    <script src="Librerias/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="Librerias/feather-icons/feather.min.js"></script>
    <script src="Librerias/perfect-scrollbar/perfect-scrollbar.min.js"></script>
    <script src="Librerias/js-cookie/js.cookie.js"></script>
    <script src="Librerias/chart.js/Chart.bundle.min.js"></script>
    <script src="Librerias/jquery.flot/jquery.flot.js"></script>
    <script src="Librerias/jquery.flot/jquery.flot.stack.js"></script>
    <script src="Librerias/jquery.flot/jquery.flot.resize.js"></script>
    <script src="Librerias/jquery.flot/jquery.flot.threshold.js"></script>
    <script src="Librerias/jqvmap/jquery.vmap.min.js"></script>
    <script src="Librerias/jqvmap/maps/jquery.vmap.world.js"></script>

    <script src="Librerias/assets/js/cassie.js"></script>
    <script src="Librerias/assets/js/flot.sampledata.js"></script>
    <script src="Librerias/assets/js/vmap.sampledata.js"></script>
    <script src="Librerias/assets/js/dashboard-one.js"></script>
  </body>
</html>
