document.addEventListener('DOMContentLoaded', () => {
    const container = document.getElementById('container');
    const registerButton = document.getElementById('register');
    const loginButton = document.getElementById('login');

    // Show the sign-up form and update URL
    registerButton.addEventListener('click', () => {
        container.classList.add('active');
        history.pushState({}, '', '/register');
    });

    // Show the sign-in form and update URL
    loginButton.addEventListener('click', () => {
        container.classList.remove('active');
        history.pushState({}, '', '/login');
    });
});
