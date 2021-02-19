// MyComponent.stories.js

import React from 'react';
import {OverviewComponent} from "./OverviewComponent";

export default {
    title: 'Overview',
    component: OverviewComponent,
};

export const Basic = () => <OverviewComponent />;
