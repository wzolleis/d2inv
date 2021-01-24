import React, {useEffect, useState} from 'react';
import './App.css';
import ApiClient from "./app/api/ApiClient";
import {SkillModComponent} from "./app/mods/components/SkillModComponent";

export const App = () => {
    const [data, setData] = useState<SkillModList>({skillMods: []})

    useEffect(() => {
        const fetchData = async () => {
            return await ApiClient.fetchModification()
        }

        fetchData().then((mods) => {
            console.log(mods)
            return mods
        })
            .then(data => setData((data)))

    }, []);

    return (
        <div className="App">
            <SkillModComponent/>
        </div>
    );
}

export default App;
