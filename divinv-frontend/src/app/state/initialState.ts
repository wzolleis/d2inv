import {AppState, FetchState, ItemState} from "../types/appTypes";

export const initialFetchState: FetchState = {
    fetching: false
}

export const initialItemState: ItemState = {
    items: []
}

export const initialAppState: AppState = {
    fetchState: initialFetchState,
    itemState: initialItemState
}


