class ApiClient {
    async fetchModification(): Promise<SkillModList> {
        const response = await fetch("/api/modification", {
            headers: {
                "content-type": "application/json",
                "accepts": "application/json"
            }
        })
        const txt = await response.text()
        const skillMods: SkillModList = JSON.parse(txt)
        return Promise.resolve(skillMods)
    }
}

export default new ApiClient()
