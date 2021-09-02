export interface FetchState {
    fetching: boolean
}

export interface ItemState {
    items: Item[];
}

export interface AppState {
    fetchState: FetchState
    itemState: ItemState;
}