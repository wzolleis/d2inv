import React, {useEffect, useState} from 'react';
import './App.css';
import ApiClient from "./app/api/ApiClient";
import {SkillModComponent} from "./app/mods/components/SkillModComponent";

export const App = () => {
    const [data, setData] = useState<SkillModList>({skillMods: []})

    useEffect(() => {
        const fetchData = async () => {
            return await ApiClient.fetchSkillMods()
        }

        fetchData().then((mods) => {
            console.log(mods)
            return mods
        })
            .then(data => setData((data)))

    }, []);

    console.log(data)

    return (
        <div className="App">
            <div className="col-md-8 mx-auto">
                <h1>Hello, world!</h1>
                <p>You've successfully loaded up the Bootstrap npm starter project!</p>
                <p>If this button looks blue and the text purple, you've done it.</p>
                <button type="button" className="btn btn-primary" data-toggle="modal" data-target="#exampleModal">Click
                    me!
                </button>
            </div>
            <SkillModComponent/>
        </div>
    );
}

export default App;
