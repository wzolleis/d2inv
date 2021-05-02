// import axios, {AxiosResponse} from 'axios';

class ApiClient {
    // async fetchSkillMods(): Promise<SkillModList> {
    //     try {
    //         const response: AxiosResponse<SkillModList> = await axios.get("/api/modification",
    //             {
    //                 headers: {
    //                     "content-type": "application/json",
    //                     "accepts": "application/json"
    //                 }
    //             });
    //         return response.data
    //     } catch (error) {
    //         return {
    //             skillMods: []
    //         }
    //     }
    // }

    async addGear(gear: Gear) {

    }
}

export default new ApiClient()
