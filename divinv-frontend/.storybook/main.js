module.exports = {
    "stories": [
        "../src/**/*.stories.mdx",
        "../src/**/*.stories.@(js|jsx|ts|tsx)"
    ],
    "addons": [
        "@storybook/preset-scss",
        "@storybook/preset-create-react-app",
        "@storybook/preset-typescript",
        "@storybook/addon-links",
        "@storybook/addon-essentials",
    ],
}