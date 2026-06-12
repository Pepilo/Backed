import Button from './Button'

function Navbar() {

    return (
        <>
        <nav className="navbar sticky-top bg-dark border-bottom border-body" data-bs-theme="dark">
            <div className="container-fluid">
                <span className="navbar-brand mb-0 h1">GameRecord</span>
                <Button color="dark" onClick={() => console.log("Navigate to login")}>Se connecter</Button>
                <Button color="dark" onClick={() => console.log("Navigate to register")}>S'inscrire</Button>
            </div>
        </nav>
        </>
    );
}

export default Navbar;