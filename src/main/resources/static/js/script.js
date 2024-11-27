const container = document.getElementById('container');
const registerBtn = document.getElementById('register');
const loginBtn = document.getElementById('login');

registerBtn.addEventListener('click', () => {
    console.log("Register Button");
    container.classList.add("active");
});

loginBtn.addEventListener('click', () => {
    console.log("Login Button");
    container.classList.remove("active");
});