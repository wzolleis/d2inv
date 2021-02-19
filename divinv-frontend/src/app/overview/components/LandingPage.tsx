import React from "react";
import {Link} from "react-router-dom";

export const LandingPage = () => {
    return (
        <div>
            <nav>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/overview">Übersicht</Link>
                    </li>
                </ul>
            </nav>
        </div>
    );
}