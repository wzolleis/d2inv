import React from 'react';
import './App.css';
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom";
import {Home} from "./app/overview/components/HomeComponent";
import {OverviewComponent} from "./app/overview/components/OverviewComponent";

export const App = () => {
    return (
        <Router>
            <div>
                <h1>Division 2 Inventory</h1>
                <nav>
                    <ul className='header'>
                        <li>
                            <Link to="/">Home</Link>
                        </li>
                        <li>
                            <Link to="/inventory">Inventory</Link>
                        </li>
                    </ul>
                </nav>
                <div className='content'>
                    <Switch>
                        <Route path="/inventory"><OverviewComponent/></Route>
                        <Route exact={true} path="/"><Home/></Route>
                    </Switch>
                </div>
            </div>
        </Router>
    );
}

export default App;
