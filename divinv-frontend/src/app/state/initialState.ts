import {AppState, FetchState, GearState, ItemState} from "../types/appTypes";

export const initialFetchState: FetchState = {
    fetching: false
}

export const initialGearState: GearState = {
    gears: []
}

export const initialItemState: ItemState = {
    gearState: initialGearState
}

export const initialAppState: AppState = {
    fetchState: initialFetchState,
    itemsState: initialItemState
}


