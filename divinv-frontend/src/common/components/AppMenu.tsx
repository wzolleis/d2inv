import React from "react";

export const AppMenu = () => {
    return (
        <>
            <nav className="navbar navbar-expand-lg navbar-light bg-light">
                <div className="container-fluid">
                    <button className="btn navbar-brand">Div2Inv</button>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"/>
                    </button>

                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <button className="btn nav-link active" aria-current="page">Home</button>
                            </li>
                            <li className="nav-item">
                                <button className="btn nav-link">Link</button>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </>
    )
}