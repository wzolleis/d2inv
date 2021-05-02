export interface FetchState {
    fetching: boolean
}

export interface GearState {
    gears: Gear[];
}

export interface ItemState {
    gearState: GearState
}

export interface AppState {
    fetchState: FetchState
    itemsState: ItemState;
}