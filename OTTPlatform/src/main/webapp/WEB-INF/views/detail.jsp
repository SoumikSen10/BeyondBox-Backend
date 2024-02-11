<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <!-- 
        -primary meta tags
     -->

   <meta
      name="description"
      content="BeyondBox is a popular OTT platform created and designed by Soumik Sen and his team."
    />

    <!-- 
        -favicon
     -->

    <link rel="shortcut icon" href="./favicon.svg" type="image/svg+xml" />

    <!-- 
        -google font link
      -->

    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=DM+Sans:wght@400;700&display=swap"
      rel="stylesheet"
    />

    <!-- 
        -custom css link
       -->

    <link rel="stylesheet" href="./assets/css/style.css" />

    <!-- 
        -custom js link
        -->

    <script src="./assets/js/global.js" defer></script>
    <script src="./assets/js/detail.js" type="module"></script>
  </head>

  <body>
    <!-- 
        -HEADER
     -->

    <header class="header">
      <a href="./index.html" class="logo">
        <img
          src="./assets/images/logo.svg"
          width="140"
          height="32"
          alt="BeyondBox Home"
        />
      </a>

      <div class="search-box" search-box>
        <div class="search-wrapper" search-wrapper>
          <input
            type="text"
            name="search"
            aria-label="search movies"
            placeholder="Search any movies ..."
            class="search-field"
            autocomplete="off"
            search-field
          />
          <img
            src="./assets/images/search.png"
            width="24"
            height="24"
            alt="search"
            class="leading-icon"
          />
        </div>

        <button class="search-btn" search-toggler>
          <img
            src="./assets/images/close.png"
            width="24"
            height="24"
            alt="close search box"
          />
        </button>
      </div>

      <button class="search-btn" search-toggler menu-close>
        <img
          src="./assets/images/search.png"
          width="24"
          height="24"
          alt="open search box"
        />
      </button>

      <button class="menu-btn" menu-btn menu-toggler>
        <img
          src="./assets/images/menu.png"
          width="24"
          height="24"
          alt="open menu"
          class="menu"
        />
        <img
          src="./assets/images/menu-close.png"
          width="24"
          height="24"
          alt="close menu"
          class="close"
        />
      </button>
    </header>
  <main>
    <!--
        -SIDEBAR
      -->

    <nav class="sidebar" sidebar>
      <div class="sidebar-inner">
        <div class="sidebar-list">
          <p class="title">Genre</p>

          <a href="./movie-list.html" menu-close class="sidebar-link">Action</a>

          <a href="./movie-list.html" menu-close class="sidebar-link">Horror</a>

          <a href="./movie-list.html" menu-close class="sidebar-link">Comedy</a>

          <a href="./movie-list.html" menu-close class="sidebar-link"
            >Adventure</a
          >

          <a href="./movie-list.html" menu-close class="sidebar-link">Drama</a>

          <a href="./movie-list.html" menu-close class="sidebar-link">Sci-Fi</a>
        </div>

        <div class="sidebar-list">
          <p class="title">Language</p>

          <a href="./movie-list.html" menu-close class="sidebar-link"
            >English</a
          >

          <a href="./movie-list.html" menu-close class="sidebar-link">Hindi</a>

          <a href="./movie-list.html" menu-close class="sidebar-link"
            >Bengali</a
          >
        </div>

        <div class="sidebar-footer">
          <p class="copyright">Copyright 2023 <a href="#">BeyondBox</a></p>

          <img
            src="./assets/images/tmdb-logo.svg"
            width="130"
            height="17"
            alt="the movie database logo"
          />
        </div>
      </div>
    </nav>
    <div class="overlay" overlay menu-toggler></div>

    <article class="container" page-content></article>
  </main>
  </body>

</html>