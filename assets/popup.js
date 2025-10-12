// JavaScript: Módulo para manejar popups desde hipervínculos
document.addEventListener("DOMContentLoaded", () => {
    const links = document.querySelectorAll("a.popup-link");

    links.forEach(link => {

        link.addEventListener("click", event => {
            event.preventDefault(); // Evita navegación
            const mensaje = link.dataset.mensaje || "No tiene un vinculo a redirigir";
            alert(mensaje);
        });

    });
});
