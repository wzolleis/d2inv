const MiniCssExtractPlugin = require('mini-css-extract-plugin');

module.exports = {
    "stories": [
        "../src/**/*.stories.mdx",
        "../src/**/*.stories.@(js|jsx|ts|tsx)"
    ],
    "addons": [
        "@storybook/addon-links",
        "@storybook/addon-essentials",
        "@storybook/preset-create-react-app",
        "@storybook/preset-typescript",
        {
            name: '@storybook/preset-scss',
            options: {
                cssLoaderOptions: {
                    modules: true,
                    localIdentName: '[name]__[local]--[hash:base64:5]',
                }
            }
        }
    ],
}