import React from 'react';
import {AppMenu} from "./AppMenu";
import {AppContent} from "./AppContent";

import {BrowserRouter as Router} from "react-router-dom";

export const App = () => {
    return (
        <>
            <Router>
                <AppMenu/>
                <AppContent/>
            </Router>
        </>
    );
}

export default App;
