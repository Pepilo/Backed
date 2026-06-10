import { Link } from "react-router-dom";
import Button from "./Button";

function NotFound() {
    return (
        <>
        <h1>Nothing to play around here :/...</h1>
        <Link to={"/"}>
            <Button onClick={() => console.log("User left error page")}>Return to your playground</Button>
        </Link>
        </>
    );
}

export default NotFound;